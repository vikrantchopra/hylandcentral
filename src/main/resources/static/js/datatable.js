$(document).ready( function () {
	 var table = $('#employeesTable').DataTable({
			"sAjaxSource": "/hylandcentral/api/employees/all",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "name" },
				  { "mData": "username" },
				  { "mData": "empId" },
				  { "mData": "email" },
				  { "mData": "phone" },
				  { "mData": "title" },
				  { "mData": "team" },
				  { "mData": "seat" },
				  { "mData": "extension" },
				  { "mData": "manager" },
			]
	 })
});