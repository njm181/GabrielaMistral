<?php

include('conexion.php');
$usuario = $_POST['username'];
$password = $_POST['password'];

$consulta = "select * from usuario where username = '$usuario' and password = '$password'";

$resultado = $conexion ->query($consulta);

while($fila = $resultado->fetch_array()){
    $evento[] = array_map('utf8_encode', $fila);

}

echo json_encode($evento);
$resultado-> close();

?>