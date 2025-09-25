# Exercise: Day old Bread
# price  is £ 3.49
price = 3.49

# Day old bread discounted by 60 percent
discount = 0.60

# Ask user input the number of loaves of day bread
num = int(input("How many loaves of day old bread is being purchased from you? "))

# Calc total price and discount amount
dis_amount = price * num *discount
total_before = price * num 
total = total_before - dis_amount

# Display in 2 dp
print("Regular Price: ", "%7.2f" %price)
print("Number       : ", "%7.2f" %num)
print("Price        : ", "%7.2f" %total_before)
print("Discount     : ", "%7.2f" %dis_amount)
print("Total Price  : ", "%7.2f" %total)

# Exercise: Length and Slicing (23)
# type in the first line of their favourite song
first_line = input("Enter the first line of their favourite song:")

# display the length of that string
lengthOfStr = len(first_line)
print("The first line contains ", lengthOfStr , "characters")

# ask a starting number and an ending number
start_num = int(input("Enter the starting number: "))
end_num = int(input("Enter the ending number: "))
# if end_num <= lengthOfStr:
#     print("Your number is out of range.")
#     end_num = int(input("Enter the ending number: "))
# else: 

# display just that section of the text
section = first_line[start_num-1:end_num]
print("Final word: ", section)



# Exercise: Upper or Lower case name
# enter their first name
first_name = input("Enter your first name: ")

# the length of the first name is under five characters
# ask them to enter their surname
# join them together (without a space) and display the name in upper case
lengthOfFirst = len(first_name)
if lengthOfFirst <5 :
    surname = input("Enter your surname: ")
    fullname = first_name+surname
    print("Name:", str.upper(fullname))

# If the length of their first name is five or more characters, 
# display their first name in lower case.
else:
    print("Name:", str.lower(first_name))




# Exercise: Pig Latin
word= input("Enter your word: ")
firstChar = word[0]
rest = word[1:len(word)]

# if firstChar != "a" or firstChar != "e" or firstChar != "i" or firstChar != "o" or firstChar != "u":
if firstChar in ['a', 'e', 'i', 'o', 'u']: 
    final = word+"way"
    print(str.lower(final))   
    
else:
    final = rest+firstChar+"ay"
    print(str.lower(final))
