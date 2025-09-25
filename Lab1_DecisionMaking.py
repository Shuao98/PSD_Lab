# Exercise: Umbrella or no umbrella
raining = input("Is it raining? (Y/n) ")

if str.lower(raining) == "y":
    windy = input("Is it windy? (Y/n) ")
    if str.lower(windy) == "y":
        print("It’s too windy for an umbrella")
    else:
        print("Take an umbrella")
else:
    print("Enjoy your day")

# Exercise: Your age
age=int(input("Enter your age: "))
if age>= 18:
    print("you can vote")
elif age==17:
    print("You can learn how to drive")
elif age==16:
    print("you can buy a lottery ticket")
else:
    print("You can go Trick-or-Treating")


# Exercise: Even or Odd
num = int(input("Enter a number: "))
if(num %2 ==0):
    print(num, " is a even number.")
else:
    print(num, " is a odd number.") 

# Exercise: Vowel or Consonant
character = input("Enter a character: ")
if character in ['a', 'e', 'i', 'o', 'u']: 
    print(character,"is a vowel")
else:
    print(character,"is a consonant")

# Exercise: Name the shape
shapedist ={
    "3":"Triangle", 
    "4" :"Square", 
    "5" :"Pentagon", 
    "6" :"Hexagon", 
    "7" :"Heptagon", 
    "8" :"Octagon",
    "9" :"Nonagon", 
    "10" :"Decagon"
}
sides = int(input("Enter number of sides: "))
if sides >=3 and sides <=10:
    print(shapedist[str(sides)])
else:
    print("It is out of the range")

# Exercise: Classifying Triangles
first =int(input("Enter length of first side: "))
second =int(input("Enter length of second side: "))
third =int(input("Enter length of third side: "))

if first== second & second== third & third== first:
    print("It is a equilateral triangle")
elif  first== second or second== third or third== first:
    print("It is a isosceles triangle")
else :
    print("It is a scalene triangle")

# Exercise: Find the area
option=int(input("1) Square \n2) Triangle \nEnter the option: "))
if option==1:
    length = int(input("Enter the length of the sides:"))
    area = length **2
    print("Area =", area)
elif option==2:
    base = int(input("Enter the length of the base:"))
    height = int(input("Enter the length of the height:"))
    area = base * height /2
    print("Area =", area)
else:
    print("There is out of option")
