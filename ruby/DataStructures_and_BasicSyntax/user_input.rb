puts("Type in your name!")
name = gets		# () optional for methods with no args (common practice); gets() returns a string
puts(name)

seven = "4".to_i + "3".to_i #converts string to int
puts(seven)

not_seven = "4" + "3"
puts(not_seven)	# 43; concatenates strings

cool_things = "Racecars, " + "Lasers," + " Aeroplanes"
puts(cool_things)

#TO PROMPT FOR AN INTEGER
puts("I will add 5 to your number; type a number!")
input = gets
puts(5 + input.to_i)

one = 1.to_s	#converts int to string
three = 3.to_s
puts(one + three + " is an unlucky number")


#CHOMP METHOD
puts("Enter your name")
name = gets
puts("Hello " + name + "!") #! ends up on separate line; name reads in the name chars and the subsequent enter key


#chomp() is called on a string and removes any \n at the end of the string:
puts("enter name")
name = gets.chomp
puts("Hello " + name + "!")

# OR::

puts("Type in your name!")
name = gets

# Reassign name to refer to the new string returned by `name.chomp`
name = name.chomp  #cannot call name.chomp; method produces a new string w/o \n; doesn't change the original string.

puts("Hello " + name + "!")


