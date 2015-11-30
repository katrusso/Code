# Write a method that takes in a string. Your method should return the
# most common letter in the array, and a count of how many times it
# appears.
#
# Difficulty: medium.

def most_common_letter(string)
	container = string.split("")		# holds all the individual letters that comprise the string (including duplicate letters)
	letters = Hash.new(0)				# key-value data structure with default value = 1
	
	mostCommonLetter = nil
	mostCommonLetterCount = 0
	count = nil
	
	while container.length > 0
		letter = container.pop
		letters[letter] += 1
		
		count = letters[letter]
		puts "letter: #{letter}  count: #{count}\n" + "-" * 25

		unless count < mostCommonLetterCount
			mostCommonLetterCount = count
			mostCommonLetter = letter
		end	
	end
	return [mostCommonLetter, mostCommonLetterCount]
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

=begin 
#APP ACADEMY SOLN
---------------------------------
def most_common_letter(string)
  most_common_letter = nil
  most_common_letter_count = nil

  idx1 = 0
  while idx1 < string.length
    letter = string[idx1]
    count = 0

    idx2 = 0
    while idx2 < string.length
      if string[idx2] == letter
        count += 1
      end
      idx2 += 1
    end

    if (most_common_letter_count == nil) || (count > most_common_letter_count)
      most_common_letter = letter
      most_common_letter_count = count
    end

    idx1 += 1
  end

  return [most_common_letter, most_common_letter_count]
end
---------------------------------
=end