$("#new-org").click(function(){
    $("#nom").toggleClass("hidden");
});

$("#new-org-cancel").click(function(){
    $("#nom").toggleClass("hidden");
});

$("#new-invite").click(function(){
    $("#nim").toggleClass("hidden");
});

$("#new-invite-cancel").click(function(){
    $("#nim").toggleClass("hidden");
});

$("#new-org-confirm").click(function() {
    addOrganization();
    $("#nom").toggleClass("hidden");
})

$(document).on('click', '.organization', function(){ 
	$('#organizations').children(".organization").each(function () {
        $(this).removeClass("org-selected");
    });
    $(this).toggleClass("org-selected");
    console.log($(this).attr('id'));
    var idJson = {"idOrganization":$(this).attr('id')};
    $.post("http://localhost:8080/Planit/clickOrganization", JSON.stringify(idJson), function(data, status){
    	console.log(data);
    });
}); 