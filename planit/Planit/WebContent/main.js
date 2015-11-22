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

$(".organization").click(function(){
    $('#organizations').children(".organization").each(function () {
        $(this).removeClass("org-selected");
    });
    $(this).toggleClass("org-selected");
})

$("#new-org-confirm").click(function() {
    addOrganization();
    $("#nom").toggleClass("hidden");
})
