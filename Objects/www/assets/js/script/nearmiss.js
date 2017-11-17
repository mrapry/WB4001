$( "#header" ).load( "common/header-login.html" );
$( "#footer" ).load( "common/footer.html" );
$( "#content" ).load( "content/login.html" );

function loadPage(e) {
    var hhtm=e.split('.'),uri=hhtm[0].split('/');
     e && ($("div#content").load(e, function() {
        $("div#content").fadeIn("slow"), window.location.hash = uri[1];
    }));
}

function refeshPage(){
	var hhtm=window.location.hash,e = $.trim(hhtm.replace("#",""));
	console.log("DATA :"+e);
     e && ($("div#content").load("content/"+e+".html", function() {
        $("div#content").fadeIn("slow"), window.location.hash = e;
    }));
    if (hhtm!="") {
    	$( "#header" ).load( "common/header.html" );
    }
}
refeshPage();

function doLogout(){
    // window.location.href("/");
	// loadPage("content/login.html");
	// $( "#content" ).load( "content/login.html" );
    window.location.href = "/";
	$( "#header" ).load( "common/header-login.html" );
}


