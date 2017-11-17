$( "#header" ).load( "common/header-test.html" );
$( "#footer" ).load( "common/footer.html" );
// $( "#content" ).load( "content/login.html" );

loadPage("content/login.html");

function loadPage(e) {
    var hhtm=e.split('.'),uri=hhtm[0].split('/');
     e && ($("div#content").load(e, function() {
        $("div#content").fadeIn("slow"), window.location.hash = uri[1];
    }));
}

function refeshPage(){
	var hhtm=window.location.hash,e = $.trim(hhtm.replace("#",""));
     e && ($("div#content").load("content/"+e+".html", function() {
        $("div#content").fadeIn("slow"), window.location.hash = e;
    }));
}

refeshPage();