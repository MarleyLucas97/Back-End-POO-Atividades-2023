<?php 
class Usuario{

    private $id;
    private $nome;
    private $email;
    private $senha;

    public function setId($i){
        $this->id = $i;
    }

    public function getId(){
        return $this->id;
    }

    public function setNome($n){
        $this->nome = $n;
    }

    public function getNome(){
        return $this->nome;
    }
    
    public function setEmail($e){
        $this->email = $e;
    }

    public function getEmail(){
        return $this->email;
    }

    public function setSenha($s){
        $this->senha = $s;
    }
    public function getSenha(){ 
        return $this->senha;
    }
}

interface UsuarioDAO{
    public function add(Usuario $u);
    public function atualizar(Usuario $usuario);
    public function deletar($id);
    public function listar();
    public function logar($nome,$senha);
}

?>