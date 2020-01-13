# Notes

Please add here any notes, assumptions and design decisions that might help up understand your though process.
- Initial refactor project structure to get better understanding of the code.
- Do not modify existing test where possible.
- Added AssertJ library to make testing easier for TDD and makes test more readable.
- Added Mockito library to mock other classes that are not under test.
- Added apache commons collection utils to test collections validity.
- For simple sakes discounts do not apply to weighted products. Need to refactor to discount only similar items.

__Ran out of time, describe your intentions:__
 - If more promotions (Buy one, get one free and 3 for 2) was to be applied then current solution not scalable. Would of liked to inject a List of Promotions into the Total Calculator component. 
 - Also the basket would be injected with the Total Calculator component.  
 - Would of liked to do more tests ItemByWeight 
 - Would of added Jacaco and Findbugs to the project, To get at least 90% code coverage and clean code.
 