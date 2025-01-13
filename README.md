A.	Create a class name Emolument in Java, to represent an emolument. The class contains the following:
i.	Two double data fields name basic_salary and tax_relief that represent basic salary and tax relief amounts. This data fields should be encapsulated.                      

ii.	A constructor that creates emolument with the specified Basic Salary and Tax Relief.

iii.	A method named getBasicsalary() that returns the basic_salary.

iv.	A method named getTaxRelief() that returns the tax_relief.

v.	A method named SSNIT() that returns the computed SSNIT contribution of the emolument. Note: SSNIT contribution is 3.5% of Basic Salary.

vi.	A method named taxableIncome() that returns the computed Taxable Income of the emolument. Note: Taxable Income = Basic salary – (Tax relief + SSNIT contribution).



B.	Create a class named MyEmolument that inherits from Emolument class. The class contains the following:
i.	Two double data fields name basic_salary and tax_relief, that represent basic salary and tax relief amounts. This data fields should be encapsulated.
                                                                                                         
ii.	A non-arg constructor that creates a default emolument. The default values are 0 for basic salary and tax relief.
                                                                                                         
iii.	A constructor that creates MyEmolument with the specified basic salary and Tax relief.
                                                                                                           
iv.	A method named incomeTax() that return the computed Income Tax. Income Tax is calculated as follows:
a.	The first 500.00 of Taxable Income, the tax rate is 5%.
b.	The next 500.00 Taxable Income, the tax rate is 12.5%.
c.	The rest, the tax rate is 17.5%.
