$( function() {
	
	$( '#bar' ).draggable(
	
		//부모요소 안에서 드래그
		{ containment: 'parent' } ,
	
		{ drag: function() {
			/*------------------------------------------------------------------------------------
			
				스크롤바 공식
				
				스크롤바 가동범위			a ~ b			0 ~ 450
				움직일것 가동범위			c ~ d			0 ~ 600
				
				결과값 = ( d - c ) / ( b - a ) * ( 스크롤바 위치값 - a ) + c;
			
			--------------------------------------------------------------------------------------*/
				
				//스크롤바 위치값
				var bar_pos = $( '#bar' ).position().left;
				
				var bg_width = ( 600 - 0 ) / ( 450 - 0 ) * ( bar_pos - 0 ) + 0;
			
				$( '#bg1' ).css( { 'width' : bg_width } );
			
		} }
			
	);
	
});







