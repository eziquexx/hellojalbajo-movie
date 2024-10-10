/**
 * 
 */


function comedyListFetch() {
	const loading = document.getElementById("coemdyloading");
	const error = document.getElementById("coemdyError");
	const comedyList = document.getElementById("comedyList");
	
	loading.style.display = "block";
	error.style.display = "none";
	comedyList.innerHTML = "";
	
	
	fetch("/comedy/api")
	.then(response => {
		if (!response.ok) {
			throw new Error ("Error 발생: ", error);
		}
		
		return response.json();
	})
	.then(comedy => {
		const li = document.createElement("li");
		
		comedy.forEach(item => {
			li.innerHTML = `<a href=">${item.id}</a>`;
		})
	})
	.catch(error => {
		console.error("error", error);
	})
	
}

window.addEventListener("submit", comedyListFetch);