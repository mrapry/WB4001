function linkMenu(id){
	switch(id){
		case 0: 
		loadPage("content/dashboard.html");
		break;
		case 1: 
		loadPage("content/monitoring.html");
		break;
		case 2: 
		loadPage("content/secman.html");
		break;
		case 3: window.location = "../"; break;
		default : console.log("error");break;
	}
}