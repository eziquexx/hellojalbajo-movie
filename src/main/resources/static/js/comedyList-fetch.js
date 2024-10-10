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
		loading.style.display = "none";
		
		comedy.forEach(item => {
			const li = document.createElement("li");
			li.innerHTML = `<a href="${item.id}">${item.id} - ${item.movieName}(${item.productionYear})</a>`;
			comedyList.appendChild(li);
		})
	})
	.catch(error => {
		console.error("error", error);
		loading.style.display = "none";
		error.style.display = "block";
	})
	
}

window.addEventListener("DOMContentLoaded", comedyListFetch);