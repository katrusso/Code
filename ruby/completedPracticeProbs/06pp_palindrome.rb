# Write a method that takes a string and returns true if it is a
# palindrome. A palindrome is a string that is the same whether written
# backward or forward. Assume that there are no spaces; only lowercase
# letters will be given.
#
# Difficulty: easy.


def palindrome?(string)
  letters = string.split("")

  return false if letters.shift != letters.pop unless letters.length == 1
  return true if letters.length <= 1 else palindrome?(letters.join) 
end



# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts('palindrome?("abc") == false: ' + (palindrome?('abc') == false).to_s)
puts('palindrome?("abcba") == true: ' + (palindrome?('abcba') == true).to_s)
puts('palindrome?("z") == true: ' + (palindrome?('z') == true).to_s)
puts('palindrome?("bb") == true: ' + (palindrome?('bb') == true).to_s)

=begin
#APP ACADEMY SOLN
---------------------------------
def palindrome?(string)
  i = 0
  while i < string.length
    if string[i] != string[(string.length - 1) - i]
      return false
    end

    i += 1
  end

  return true
end
---------------------------------
=end



=begin 
#MY ORIGINAL SOLN 
---------------------------------
def palindrome?(string)
  letters = string.split("")
  while letters.length >=2
    return false if letters.shift != letters.pop 
  end
  return true
end
---------------------------------
=end