// $('#btn-clear').click(function() {
// 	$('#username').val('');
// 	$('#password').val('');
// });

function login(){
	// $( "#content" ).load( "content/dashboard.html" );
	console.log("dihit login");
	loadPage("content/dashboard.html");
	$( "#header" ).load( "common/header.html" );
}

function clear(){
	$('#username').val('');
	$('#password').val('');
}
