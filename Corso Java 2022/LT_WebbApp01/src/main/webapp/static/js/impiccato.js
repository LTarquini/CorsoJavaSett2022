var parola="BIANCO";
var contaErrori=0;
var contaCorretti=0;

$(document).ready(   function() {
$("#alert_vinto").hide();
$("#alert_perso").hide();


$("#btn_scelta").click(
	function(){
		var caratterePremuto=$("#text_scelta").val();

		
		if (parola.indexOf(caratterePremuto) == -1){
			contaErrori=contaErrori+1;
			$("#v"+contaErrori).removeClass("fa-shield");
			$("#v"+contaErrori).addClass("fa-shield-halved");
		}
		else {
			 contaCorretti=contaCorretti+1;
			 if(caratterePremuto=="B") $("#l1").val("B");
			 if(caratterePremuto=="I") $("#l2_").val("I");
			 if(caratterePremuto=="A") $("#l3").val("A");
			 if(caratterePremuto=="N") $("#l4").val("N");
			 if(caratterePremuto=="C") $("#l5").val("C");
			 if(caratterePremuto=="O") $("#l6").val("O");	  
		}


	if(contaErrori==6)   $("#alert_perso").show();
	if(contaCorretti==6) $("#alert_vinto").show();
	}
);

});