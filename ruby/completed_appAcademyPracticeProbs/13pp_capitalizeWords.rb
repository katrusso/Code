# Write a method that takes in a string of lowercase letters and
# spaces, producing a new string that capitalizes the first letter of
# each word.
#
# You'll want to use the `split` and `join` methods. Also, the String
# method `upcase`, which converts a string to all upper case will be
# helpful.
#
# Difficulty: medium.

def capitalize_words(string)
	words = string.split(" ")			# break the sentence into an array of words

	i = 0
	while i < words.length 
		word = words.shift				# pop word off the front of the word array    UNNECESSARY STEPS -- SEE SOLN BELOW
		letters = word.split("")		# break the word into an array of letters
		letters[0] = letters[0].upcase	# capitalize the first letter
		word = letters.join				# rejoin the individual letters into a word
		words.push(word)				# push the word back onto the word array (at the end)
		i += 1
	end
	sentence = words.join(" ")			# rejoin the individual words into a sentence
	return sentence
end

# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts(
  'capitalize_words("this is a sentence") == "This Is A Sentence": ' +
  (capitalize_words("this is a sentence") == "This Is A Sentence").to_s
)
puts(
  'capitalize_words("mike bloomfield") == "Mike Bloomfield": ' +
  (capitalize_words("mike bloomfield") == "Mike Bloomfield").to_s
)


=begin 
#APP ACADEMY SOLN

def capitalize_words(string)
  words = string.split(" ")

  idx = 0
  while idx < words.length
    word = words[idx]

    word[0] = word[0].upcase

    idx += 1
  end

  return words.join(" ")
end
=end