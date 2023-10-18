<?php  

class usuario{

    private $id;

    private $nome;

    private $email;

    public function setId($i){
        $this->id=$i;
    }

    public function getId(){
        return $this->id;
    }

    public function setNome($n){
        $this->id=$n;
    }

    public function getNome(){
        return $this->nome;
    }

    public function setEmail($e){
        $this->id=$e;
    }

    public function getEmail(){
        return $this->email;
    }
}



?>