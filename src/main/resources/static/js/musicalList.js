const musicalList = document.getElementById("musicalList");

fetch("/musical/api")
.then(response => {
	if(!response.ok){
		throw new Error("Network response is not ok");
	}
	return response.json();
})
.then(musicals => {
	musicals.forEach(musical => {
		const li = document.createElement("li");
		li.innerHTML = `<a href="/musical/${musical.id}">id : ${musical.id}, 제목 :${musical.movieName}</a>`
		musicalList.appendChild(li);
	})
})
.catch(err => {
	console.log("Error : ",err);
})