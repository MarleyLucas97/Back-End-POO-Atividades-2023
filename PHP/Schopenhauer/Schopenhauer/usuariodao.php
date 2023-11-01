<?php 

require 'usuario.php';

class daoMysql implements UsuarioDAO{

    private $pdo;

    public function __construct(PDO $drive){
        $this->pdo = $drive;
    }

    public function add(Usuario $u){
        $sql = $this->pdo->prepare("INSERT into usuario (nome,email) values (:nome,:senha)");
        $sql->bindValue (":nome", $u->getNome());
        $sql->bindValue (":email",$u->getEmail());

        $u->setId($this->pdo->lastInsertId());
        return $u;
    }

    public function atualizar(Usuario $u){
        $sql = $this->pdo->prepare("UPDATE usuario set nome = nome email = email where id = id");
        $sql->bindValue(":nome",$u->getNome());
        $sql->bindValue(":email",$u->getEmail());
        $sql->bindValue(":id",$u->getId());
        $sql->execute();

        return true;
    }

    public function deletar($id)
    {
        $sql = $this->pdo->prepare("DELETE from usuario where id = :id");
        $sql->bindValue(":id",$id);
        $sql->execute();        
    }

    public function listar()
    {
        $lista = [];
        $sql = $this->pdo->query("SELECT * from usuario");
        if($sql->rowCount()> 0){
            $dados = $sql->fetchAll();

            foreach($dados as $item){
                $user = new Usuario();
                $user->setId($item['id']);
                $user->setNome($item['nome']);
                $user->setEmail($item['email']);

                $lista[] = $user;
            }
        }

        return $lista;

    }

    public function logar($nome, $senha){
        $sql = $this->pdo->prepare("SELECT * from usuario where nome= :nome and senha = :senha");
        $sql->bindValue(":nome",$nome);
        $sql->bindValue(":senha",$senha);
        $sql->execute();

        if( $sql->rowCount()> 0){   
            return true;
    }
    return false;
}
}

?>