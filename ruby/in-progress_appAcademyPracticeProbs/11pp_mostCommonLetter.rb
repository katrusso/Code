# Write a method that takes in a string. Your method should return the
# most common letter in the array, and a count of how many times it
# appears.
#
# Difficulty: medium.

def most_common_letter(string)
	letters = string.split("")
	container = Hash.new(0)
	
	most_common_letter = nil
	most_common_letter_count = 0
	
	while letters.length > 0
		letter = letters.pop

		letters_count.push(letter)
		letters_count[letter] += 1

		if letters_count[letter].to_i > most_common_letter_count
			most_common_letter_count = letters_count[letter]
			most_common_letter = letter
		end
	end
	puts(most_common_letter, most_common_letter_count)
	return [most_common_letter, most_common_letter_count]
end

# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts(
  'most_common_letter("abca") == ["a", 2]: ' +
  (most_common_letter('abca') == ['a', 2]).to_s
)
puts(
  'most_common_letter("abbab") == ["b", 3]: ' +
  (most_common_letter('abbab') == ['b', 3]).to_s
)