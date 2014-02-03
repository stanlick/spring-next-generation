<jsp:include page="head.jsp" />
<body>
<jsp:include page="banner.jsp" />	
<!--===============================================================  Intro =====================================================================================--> 
	<div class="wrapper">
 		<div class="grids">
                <div class="grid-16 grid intro green">
                 
                       <p>An introducing line here or just delete this column! You can use class 'grey' or 'green'.</p>
                                        
                 </div><!--end of slogan div-->
 
          </div><!--end of div grids-->
	
    </div><!--end of div wrapper-->    

<!--===============================================================  Green box (sidebar) =====================================================================================-->     
      
     <div class="wrapper">
    
    		<div class="grids">

                <div class="grid-6 grid green">
                            <h2>Styles</h2>
                            <p>This is the style-playground! It shows how different elements of this template 
                                are formatted and can be used as a reference when using the template to style 
                                your own website.</p>
                             <h5>Grid</h5>
                                <p>The grid system is easy to use. You´ve got 16 colums, so if you want to divide your content 
                                into halfs, use grid-8 plus grid-8, for example.
                                Don´t forget to always wrap them into a container with class "grids".</p>
                            <h5>CSS</h5>
                                <p>There are many useful classes in inuit.css and additional ones in eve-styles.css.
                                Have a look into the code to find the ones that suit your needs.</p>
                </div>
                
<!--===============================================================  Style playground =====================================================================================-->                 
                
                  <div class="grid-10 grid">
                           <h2>Style playground</h2>
   
                                <p>The following are examples of header formats:</p>
                                
                                <h2>H2 Heading</h2>
                                <h3>H3 Heading</h3>
                                <h4>H4 Heading</h4>
                                <h5>H5 Heading</h5>
                                <h6>H6 Heading</h6>
                            
                                <hr/>
                                
                                <h2>Text</h2>
                                <p>This paragraph shows how all text encapsulated only within <strong>&lt;p&gt;&lt;/p&gt;</strong> 
                                tags will appear.</p>
                                <p>More text examples are as follows:</p>
                                <p>
                                    <em>This is emphasised text</em><br/>
                                    <strong>This is strong text</strong><br/>
                                    <del>This is deleted text</del><br/>
                                    <a href="#">This is a link</a>
                                </p>
                                <p>
                                <code>This is a block of code<br/>
                                This is a block of code<br/>
                                This is a block of code</code>
                                </p>
                                
                                <p><a class="button" href="#">This is a button</a></p>
                                
                                    <p class="quote">
                                        "This is a styled quote. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Duis tempor. 
                                        Nullam tortor. Nulla vel dui. Curabitur et metus. This is a quote. Lorem ipsum dolor 
                                        sit amet, consectetuer adipiscing elit. Duis tempor. Nullam tortor. Nulla vel dui. 
                                        Curabitur et metus." <span>John Doe (1900 - 2000) </span>
                                    </p>
                                    
                                
                                    
                                <h4 class="text-center">Can I haz messages?</h4>
                                    <p class="message success">Yes of course you can!</p>
                                    <p class="message info">This is an info message.</p>
                                    <p class="message warning">Note: Eve doesn´t claim to be perfect (me to)!</p>
                                    <p class="message error">It is prohibited to turn this design into a fixed layout!</p>
                                
                    <hr/>
                                
                                <h2>Images</h2>
                                <p>The following are examples of image formats:</p>
                                <p><img class="left" src="img/small-img4.jpg" width="200" height="150" alt="demo-pic"> <strong>A left aligned 
                                image</strong>. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed viverra tortor non dolor. 
                                Donec nulla libero, ullamcorper sed, consequat dignissim, luctus blandit, sapien. 
                                In ante. Proin aliquam odio ut sem. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Consequat dignissim, 
                                luctus blandit, sapien. In ante. Proin aliquam odio ut sem consequat dignissim, luctus blandit, sapien. 
                                In ante. Proin aliquam odio ut sem. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>
                                <p><img class="right" src="img/small-img2.jpg" width="200" height="150" alt="demo-pic"> <strong>A right 
                                aligned image</strong>. Lorem ipsum dolor sit amet, 
                                consectetuer adipiscing elit. Sed viverra tortor non dolor. Donec nulla libero, ullamcorper sed, consequat 
                                dignissim, luctus blandit, sapien. 
                                In ante. Proin aliquam odio ut sem. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>
                                <p><a href="#"><img class="left" src="img/small-img1.jpg" width="200" height="150" alt="demo-pic"></a> <strong>A left 
                                aligned, linked image</strong>. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed viverra tortor 
                                non dolor. Donec nulla libero, ullamcorper sed, consequat dignissim, luctus 
                                blandit, sapien. In ante. Proin aliquam odio ut sem. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </p>
                                
                                <hr/>
                                
                                <h2>Lists</h2>
                                <h3>Unordered list</h3>
								<ul>
                                    <li><span>List item example</span></li>
                                    <li><span>List item example</span>
                                        <ul>
                                            <li><span>Sub list item example</span></li>
                                            <li><span>Sub list item example</span></li>
                                        </ul>
                                    </li>
                                    <li><span>List item example</span></li>
                                </ul>
                                
                                 <h3>Unordered list with class "check"</h3>
									<ul class="check">
                                    <li><span>List item example</span></li>
                                    <li><span>List item example</span>
                                        <ul>
                                            <li><span>Sub list item example</span></li>
                                            <li><span>Sub list item example</span></li>
                                        </ul>
                                    </li>
                                    <li><span>List item example</span></li>
                                </ul>
                                
                                <h3>Ordered list</h3>
                                <ol>
                                    <li><span>List item example</span></li>
                                    <li><span>List item example</span>
                                        <ol>
                                            <li><span>Sub list item example</span></li>
                                            <li><span>Sub list item example</span></li>
                                        </ol>
                                    </li>
                                    <li><span>List item example</span></li>          
                                </ol>
                                
                                <h3>Definition list</h3>
                                <dl>
                                    <dt>Definition title</dt>
                                    <dd>Definition description</dd>
                                    <dt>Definition title</dt>
                                    <dd>Definition description</dd>
                                </dl>
                                
                                 <h2>And how about tabs?</h2>
                            
                           
                            <ul class="tabs">
                                    <li><a href="#tab1">Here</a></li>
                                    <li><a href="#tab2">They</a></li>
                                    <li><a href="#tab3">Are!</a></li>
                                </ul>
                                
                                <div class="tab_container">
                                    <div id="tab1" class="tab_content">
                                        <p>
                                        These are some very basic tabs. There are some downsides with tabs in responsive layouts -
                                        in small screens they will stack over each other. Make sure to test how
                                        it looks like when you want to use them. Don´t use too long titles.
                                        </p>
                                    </div>
                                    <div id="tab2" class="tab_content">
                                        <p>
                                        These are some very basic tabs. There are some downsides with tabs in responsive layouts -
                                        in small screens they will stack over each other. Make sure to test how
                                        it looks like when you want to use them. Don´t use too long titles.
                                        </p>
                                    </div>
                                     <div id="tab3" class="tab_content">
                                       <p>
                                        These are some very basic tabs. There are some downsides with tabs in responsive layouts -
                                        in small screens they will stack over each other. Make sure to test how
                                        it looks like when you want to use them. Don´t use too long titles.
                                        </p> 
                                    </div>
                                </div>
							
                                
      <hr class="clear">                         
                                
                                <h2>Tables</h2>
                                <p>Data tables and forms don´t always play nice in responsive layouts.
                                They can be flexible in width but to display cell content in a way that is 
                                readable and makes sense, they have to have a certain width. There are
                                approaches in the web to deal with that, but that´s an own topic.
                                Search for it if you are in need of larger tables or forms.</p>
                                
                                
                                <table>
                                    <thead>
                                        <tr>
                                            <th scope="col">Table header</th>
                                            <th scope="col">Table header</th>
                                            <th scope="col">Table header</th>
                                            <th scope="col">Table header</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr><td colspan="4">&nbsp;</td></tr>
                                    </tfoot>
                                    <tbody>
                                        <tr>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                        </tr> 
                                        <tr>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                        </tr>    
                                        <tr>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                        </tr>
                                    </tbody>                           
                                </table>
                                
                                <table>
                                    <thead>
                                        <tr>
                                            <th scope="col">&nbsp;</th>
                                            <th scope="col">Table header</th>
                                            <th scope="col">Table header</th>
                                            <th scope="col">Table header</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr><td colspan="4">&nbsp;</td></tr>
                                    </tfoot>
                                    <tbody>
                                        <tr>
                                            <th scope="row">Cell data</th>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                        </tr> 
                                        <tr>
                                            <th scope="row">Cell data</th>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                        </tr>    
                                        <tr>
                                            <th scope="row">Cell data</th>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                            <td>Cell data</td>
                                        </tr>
                                    </tbody>                           
                                </table>
                                
                            <p>To see a form, go <a href="contact.html" title="Form-demo on the contact page">here</a>!</p>
                                
                           
                </div><!--end of grid-10--> 
			</div><!--end of grids-->
           
		<hr>     
	</div><!--end of wrapper-->
    
<!--===============================================================  Bottom content =====================================================================================-->     
		
   <div class="wrapper">   
         
                    <div class="grids">
                        <div class="grid-4 grid">
                            <img src="img/small-img1.jpg" alt="demo-image">
                            <h4 class="text-center">Inuit framework</h4>
                            <p>This template is responsive! It is based on the <a href="http://csswizardry.com/inuitcss/" title="The Inuit CSS Framework">Inuit-framework</a>. 
                            You can extend the framework with igloos - have a look at the website!</p>
                        </div>
                        
                          <div class="grid-4 grid">
                        <img src="img/small-img2.jpg" alt="demo-image">
                       	 <h4 class="text-center">Inbuilt grid</h4>
                            <p>The grid used here has a max-width of 1120 px for larger screens and 16 columns with no end or last in use to stop the flow - self-clearing!</p>
                        </div>
                        
                        <div class="grid-4 grid">
                        <img src="img/small-img3.jpg" alt="demo-image">
                        <h4 class="text-center">FlexSlider</h4>
                          	<p>The slider is the fantastic responsive Flexslider, which offers many features. 
                            <a href="http://flex.madebymufffin.com/" title="Visit the FlexSlider Website!">Visit the website</a> 
                            to find out more about the functions and features!</p>     
                        </div>

                        <div class="grid-4 grid">
                        <img src="img/small-img4.jpg" alt="demo-image">
                        <h4 class="text-center">Nice social icons</h4>
                            <p>The social icons were made by Alex Peattie, you can 
                            <a href="http://www.alexpeattie.com/blog/justvector-icons-update/" title="Icon set by Alex Peattie">
                            download the set on his website</a> and even use them as a webfont with @font-face!</p>
                        </div>
 
					</div><!--end of grids-->
		</div><!--end of wrapper-->

			<jsp:include page="foot.jsp" />
</body>
</html>