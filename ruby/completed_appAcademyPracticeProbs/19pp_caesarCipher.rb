# Write a method that takes in an integer `offset` and a string.
# Produce a new string, where each letter is shifted by `offset`. You
# may assume that the string contains only lowercase letters and
# spaces.
#
# When shifting "z" by three letters, wrap around to the front of the
# alphabet to produce the letter "c".
#
# You'll want to use String's `ord` method and Integer's `chr` method.			I do what i want!
# `ord` converts a letter to an ASCII number code. `chr` converts an
# ASCII number code to a letter.
#
# You may look at the ASCII printable characters chart: 						(but i'll take it under advisement)
#
#     http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters
#
# Notice that the letter 'a' has code 97, 'b' has code 98, etc., up to
# 'z' having code 122.
#
# You may also want to use the `%` modulo operation to handle wrapping
# of "z" to the front of the alphabet.  										(E.G. (index + offset) % 26 )
#
# Difficulty: hard. Because this problem relies on outside
# information, we would not give it to you on the timed challenge. :-)

def caesar_cipher(offset, string)	# Are arrays pass by ref? I made a fn earlier where shiftedAlphabet = get_shifted_alphabet(offset, alphabet) and alphabet changed too
  alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
  offsetAlphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
  output = ""
  caesar = Hash.new()
  i = j = s = 0

  while i < offset
  	value = offsetAlphabet.shift()
	offsetAlphabet.push(value)
	i += 1
  end

  while j < 26
	caesar[alphabet[j]] = offsetAlphabet[j]
	j += 1
  end

  while s < string.length
	letter = string[s]
	s += 1
	output = output + (caesar[letter] || " ")
  end
  return output
end

# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts(
  'caesar_cipher(3, "abc") == "def": ' +
  (caesar_cipher(3, 'abc') == 'def').to_s
)
puts(
  'caesar_cipher(3, "abc xyz") == "def abc": ' +
  (caesar_cipher(3, 'abc xyz') == 'def abc').to_s
)

=begin
#APP ACADEMY SOLN

def caesar_cipher(offset, string)
  words = string.split(" ")

  word_idx = 0
  while word_idx < words.length
    word = words[word_idx]

    letter_idx = 0
    while letter_idx < word.length
      char_i = word[letter_idx].ord - "a".ord

      new_char_i = (char_i + offset) % 26
      word[letter_idx] = ("a".ord + new_char_i).chr

      letter_idx += 1
    end

    word_idx += 1
  end

  return words.join(" ")
end
=end