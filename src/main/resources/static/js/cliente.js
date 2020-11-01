$(document).ready(function (){
	//alert("Hola");
	listarCliente();
});
function listarCliente(){
	$.get("cliente",{opc:1},function(data) {
		var x = JSON.parse(data);
		$("#tablita tbody tr").remove();
		for (var i = 0; i<x.length; i++) {
		$("#tablita").append("<tr><td>"+(i+1)+"</td><td>"+ x[i].codigo_cliente+"</td><td>"+ x[i].nombre+ "</td><td>"+ x[i].apellidos+ "</td><td>"+ x[i].numero_documento+ "</td><td>"+ x[i].telefono+ "</td><td>"+ x[i].email+ "</td><td><a href='#'style='color:green'onclick='editar("+ x[i].idpersona+ ")'<i class='fas fa-edit'></i></a></td><td><a href='#'style='color:red'onclick='eliminar("+ x[i].idpersona+ ")'<i class='far fa-trash-alt'></i></a></td></tr>");
		}
	});

}