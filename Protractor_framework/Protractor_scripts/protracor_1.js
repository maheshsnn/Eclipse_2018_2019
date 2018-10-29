describe('angularjs homepage todo list', function() {
  it('should add a todo', function() {
	  
    browser.get('https://angularjs.org');
    console.log("mahesh");
    
    element(by.name('password')).sendKeys("Bijili@1816")
    element(by.name('username')).sendkeys('maheshsnn');
    element(by.className('input-group-btn')).click();
    element(by.className('topnavlink')).click();

    element(by.model('yourName')).sendKeys('write first protractor test');
    element(by.css('[value="add"]')).click();

    var todoList = element.all(by.repeater('todo in todoList.todos'));
    //expect(todoList.count()).toEqual(3);
    //expect(todoList.get(2).getText()).toEqual('write first protractor test');

    // You wrote your first test, cross it off the list
    todoList.get(2).element(by.css('input')).click();
    var completedAmount = element.all(by.css('.done-true'));
    expect(completedAmount.count()).toEqual(2);
    
  
  });
  
  
  it('angular js mahesh', function() {
	  browser.get('https://angularjs.org');
	  
	  console.log("mahesh test data")
  	
  })
});