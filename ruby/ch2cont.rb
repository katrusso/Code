# LOOPS
puts("Input a number!")
num = gets.to_i

while num < 100
  puts("That number is too small! Try again!")
  # prompt again, re-assign `num`
  num = gets.to_i
end

puts("You typed " + num.to_s + " which is at least 100!")



i = 0
while i < 3
  puts("Hello world!")
  i = i + 1
end

puts("All done!")




#ARRAYS
four_primes = [2, 3, 5, 7]
an_empty_array = []

cool_things = ["Racecars", "Lasers", "Aeroplanes"]
puts(cool_things[0])
puts(cool_things[1])
puts(cool_things[2])


# You can write an array across many lines like this.
presidents = [
  "George Washington",
  "John Adams",
  "Thomas Jefferson",
  "James Madison",
  "James Monroe",
  "John Quincy Adams"
]

# Prints 6, the number of items in the array
puts(presidents.length)

# Print each one of the presidents in the array.
idx = 0
while idx < presidents.length
  puts(presidents[idx])
  idx = idx + 1
end

puts("PRESIDENTS LOOP COMPLETED!")




# ADD ITEMS TO THE END OF AN ARRAY (PUSH)
cool_things = []

while cool_things.length < 3		# Continue to prompt the user for cool things until we have three of them
  puts("Tell me a cool thing!")
  one_cool_thing = gets.chomp
  cool_things.push(one_cool_thing)	  # This adds one item at the end of the array.
end

# If the user types in "Racecars", "Lasers", and "Aeroplanes", then:
#    cool_things == ["Racecars", "Lasers", "Aeroplanes"]
# because each subsequent item is `push`ed onto the end of the array.


idx = cool_things.length - 1 	# BACKWARD ORDER
while idx >= 0
  puts(cool_things[idx])		# This would print "Aeroplanes", "Lasers", "Racecars"
  idx = idx - 1
end




# ADD ITEMS TO THE FRONT OF AN ARRAY (UNSHIFT)
cool_things = []

while cool_things.length < 3				# Continue to prompt the user for cool things until we have three of them
  puts("Tell me a cool thing!")
  one_cool_thing = gets.chomp
  cool_things.unshift(one_cool_thing)	  	# This adds one item at the beginning of the array.
end

# If the user types in "Racecars", "Lasers", and "Aeroplanes", then:
#    cool_things == ["Aeroplanes", "Laser", "Racecars"]
# because each subsequent item is `unshift`ed onto the front of the
# array.


idx = 0										# BACKWARD ORDER
while idx < cool_things.length
  puts(cool_things[idx])
  idx = idx + 1
end

# This prints the array out in order of increasing position, which is
# the opposite of the order the items were typed in.








# REMOVE ITEMS FROM THE FRONT OF AN ARRAY (SHIFT)
# REMOVE ITEMS FROM THE END OF AN ARRAY (POP)

arr = [2, 3, 5, 7]

# prints 2, the item at position zero
puts(arr[0])
# remove 2 from the array
item = arr.shift
# prints 2
puts(item)
# prints true; the leading 2 element is removed
puts(arr == [3, 5, 7])

# reset arr
arr = [2, 3, 5, 7]
# prints 7, the last item of the array
puts(arr[3])
# remove 7 from array
item = arr.pop
# prints 7
puts(item)
# prints 3, since there are only three items left
puts(arr.length)
# prints true; only the seven is removed
puts(arr == [2, 3, 5])






# ASSIGN POSITIONS IN AN ARRAY
#  use arr[idx] = value to set the object stored at a position

arr = [2, 3, 5]
arr[1] = "three"
puts(arr == [2, "three", 5])		# prints true








# what happens if you try to access a position past the last index in an array?

arr = [2, 3, 5, 7]

# All of these are cool
puts(arr[0])
puts(arr[1])
puts(arr[2])
puts(arr[3])
# Output:
#   2
#   3
#   5
#   7

# This also works! This prints a blank line.
puts(arr[4])




# Ruby returns a special object, nil, which means "nothing". Because nothing is stored at the fourth position, nil is an appropriate answer. 
# puts(nil) prints just a blank line.

