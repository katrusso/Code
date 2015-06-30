# Methods are the "verbs" of Ruby. 
# Numbers and strings are the "nouns". 
# Method does something to one or more objects.

# When we call a method, we always use the format object.method. To the left of the dot is the noun, to the right of the dot is the verb. 
# noun.verb

"7".to_i	# Invoke the method `to_i` on the object `"7"`
42.to_s		# Invoke the method `to_s` on the object `42`

ten = 5.+(5)	# Equivalent to 5 + 5
seven = 9.-(2)	# Equivalent to 9 - 2
twelve = 4.*(3)	# Equivalent to 4 * 3
two = 8./(4)	# Equivalent to 8 / 4

# puts and gets are methods. When you call them, the object is implicit, which means we can leave it out.

# COMPARISONS
puts(3 < 4)		# true
puts(5 > 10) 	# false

puts(3 == 4)	# false
puts(4 != 5)	# true
puts("Three" == "Three")	# true


# CONDITIONALS
puts("Type in a number")
num = gets.to_i

if num < 10
  puts("That's not a big number!")
elsif num < 100
  puts("That's a pretty big number")
elsif num < 1000
  puts("Wow that's a large number")
else
  puts("Holy cow, that number is blowing my mind")
end

puts("Thanks for typing in a number!")


# LOGICAL CONNECTIVES

puts("Input a number!")
number = gets.to_i
if (number > 10) && (number < 20)
  puts("Your number was greater than ten AND less than twenty!")
else
  puts("Your number was either less than ten, OR greater than twenty!")
end



puts("Input a number!")
number = gets.to_i
if (number == 7) || (number == 13)
  puts("Your number is magic!")
else
  puts("Your number is not magical")
end



puts(123 == 123)	# true
puts(!(123 == 123))	# false

(x && y) == !(!x || !y)	# DeMorgans Law

