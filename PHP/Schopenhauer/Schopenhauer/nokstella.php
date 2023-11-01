<?php 

/*$arc = 'Niztche';
$morrigan = ['Niztche','Schopenhauer','Dostoievsky'];
$wanda = array('Niztche','Schopenhauer','Dostoievsky');

//echo $arc."<br>";
//print $morrigan;
echo "<pre>";
var_dump($wanda);
print_r($morrigan);

foreach ($wanda as $dados) {
    echo $dados."<br>";
}*/

class usuario{
    private $nome;
    private $idade;

    public function setNome($n){
        $this->nome = $n;
    }

    public function getNome(){
        return $this->nome;
    }
}

$user = new usuario();
$user->setNome('Dostoievsky');

print_r($user->getNome()." ");
?>