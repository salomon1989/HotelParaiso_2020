$(document).ready(function(){
	$("#yapu").click(function(){
		$("#yapu").css("background-color","#ff8000");
	});
});
function buscar(){
	alert("Hola Yapu");
}
function deshabilitaRetroceso(){
    window.location.hash="no-back-button";
    window.location.hash="Again-No-back-button"; //chrome
    window.onhashchange=function(){window.location.hash="no-back-button";}
}



