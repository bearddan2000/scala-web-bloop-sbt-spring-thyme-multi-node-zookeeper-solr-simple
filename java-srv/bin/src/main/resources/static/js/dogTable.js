$(document).ready( function () {
	 var table = $('#dataTable').DataTable({
			"sAjaxSource": "/dogs",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
		      { "mData": "breed" },
				  { "mData": "color" }
			]
	 })
});
