/**
 * 
 */

function deleteItem(id) {
	if (confirm("정말로 삭제?")) {
		const url =`/comedy/delete/${id}`
		const form = document.createElement("form");
		
		form.method = 'post';
		form.action = url;
		
		document.body.appendChild(form);
       	form.submit(); // 폼 제출
	}
}
