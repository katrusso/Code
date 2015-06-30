# STRINGS
# Arrays represent sequences of objects; strings are sequences of characters

puts("ringo".length)	# 5




# Just like you can get the 3rd item of an array by writing arr[2], you can get the third letter of a string by writing str[2]:
str = "abcd"

idx = 0
while idx < str.length
  puts(str[idx])
  idx = idx + 1
end

# Output
#   a
#   b
#   c
#   d





# though strings are similar to arrays of letters, they are not the same:
puts("abc" == ["a", "b", "c"])		# FALSE


#SPLIT A STRING
"this is a sentence".split == ["this", "is", "a", "sentence"]

#MERGE AN ARRAY OF STRINGS INTO ONE STRING
["this", "is", "a", "sentence"].join(" ") == "this is a sentence"		# the argument to join is called a **separator**
["racecars", "lasers", "aeroplanes"].join(", ") == "racecars, lasers, aeroplanes"		# this puts a ", " between each of the cool things.





