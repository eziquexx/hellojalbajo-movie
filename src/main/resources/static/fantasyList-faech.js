/**
 * 
 */
function fantasyListFetch(){
	const loading = document.getElementById("fantasyloading");
	const error =document.getElementById("fantasyError");
	const fantasyList = document.getElementById("fantasyList");
	
	loading.style.display = "block";
	error.style.display = "none";
	fantasyList.innerHTML = "";
	
	fetch("/fantasy/api")
	.then(response => {
		if(!response.ok){
			throw new Error ("Error 발생:",error);
		}
		return response.json();
	})
	.then (fantasy => {
		loading.style.display = "none";
		
		fantasy.forEach(item =>{
			const li = document.createElement("li");
				li.innerHTML =`<a href="fantasy/${item.id}">${item.id}-${item.movieName}(${item.productionYear})</a>`;
				fantasyList.appendChild(li);
		})
	})
	.catch(error => {
		console.error("error",error);
		loading.style.display = "none";
		error.style.display="block";
	})
}
window.addEventListener("DOMContentLoaded",comedyListFetch);