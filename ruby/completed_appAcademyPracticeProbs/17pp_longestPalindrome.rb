# Write a method that takes in a string of lowercase letters (no
# uppercase letters, no repeats). Consider the *substrings* of the
# string: consecutive sequences of letters contained inside the string.
# Find the longest such string of letters that is a palindrome.
#
# Note that the entire string may itself be a palindrome.
#
# You may want to use Array's `slice(start_index, length)` method,
# which returns a substring of length `length` starting at index
# `start_index`:
#
#     "abcd".slice(1, 2) == "bc"
#     "abcd".slice(1, 3) == "bcd"
#     "abcd".slice(2, 1) == "c"
#     "abcd".slice(2, 2) == "cd"
#
# Difficulty: hard.

def palindrome?(string)
  letters = string.split("")
  while letters.length >= 2
    return false if letters.shift != letters.pop
  end
  return true
end


def longest_palindrome(string)
  letterIndicesContainer = Hash.new{|hash, key| hash[key] = []}
  letters = string.split("")
  longestPalindrome=""
  
  i=0
  while i < letters.length 
    letterIndicesContainer[letters[i]].push i
    i += 1
  end

  letterIndicesContainer.each do |hash, key| 
    i = 0
    j = key.length-1    

    if key.length > 1       
      while i < string.length 
        while j > i         
          chunk = string.slice(key[i], key[j] - key[i] + 1)  
          longestPalindrome = chunk if palindrome?(chunk) && chunk.length > longestPalindrome.length
          j = j - 1 
        end
        i += 1
      end
    end
  end
  return longestPalindrome
end

# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts(
  'longest_palindrome("abcbd") == "bcb": ' +
  (longest_palindrome('abcbd') == 'bcb').to_s
)
puts(
  'longest_palindrome("abba") == "abba": ' +
  (longest_palindrome('abba') == 'abba').to_s
)
puts(
  'longest_palindrome("abcbdeffe") == "effe": ' +
  (longest_palindrome('abcbdeffe') == 'effe').to_s
)

puts(
  'longest_palindrome("bkerbcbree") == "erbcbre": ' +
  (longest_palindrome('bkerbcbree') == 'erbcbre').to_s
)

=begin 
#APP ACADEMY SOLN

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

def longest_palindrome(string)
  best_palindrome = nil

  idx1 = 0
  while idx1 < string.length
    length = 1
    while (idx1 + length) <= string.length
      substring = string.slice(idx1, length)

      if palindrome?(substring) && (best_palindrome == nil || substring.length > best_palindrome.length)
        best_palindrome = substring
      end

      length += 1
    end

    idx1 += 1
  end

  return best_palindrome
end
=end






=begin
# HEAVILY COMMENTED VERSION OF MY CODE FOR PERSONAL REFERENCE(NOT TOTALLY COMFORTABLE WITH HASHMAPS YET AND DON'T WANT TO FORGET WHAT I DID)
# Obviously not ideal presentation of comments

def palindrome?(string) # same fn as 06pp_palindrome.rb file
  letters = string.split("")
  while letters.length >= 2
    return false if letters.shift != letters.pop
  end
  return true
end

def longest_palindrome(string)
  letterIndicesContainer = Hash.new{|hash, key| hash[key] = []}   #created a Hash for easy access to keys (letters) that appear multiple times in a string; 
                                                                  #since we need to check if substrings are palindromes, and palindromes start and end with the same 
                                                                  #letter, this makes it easy to define the ranges for each potential substring and we can ignore the
                                                                  #letters that only appear once (have a single key value).
                                                                  # hash == letter (e.g. 'a')
                                                                  # key == letter indices in string. (e.g. 'abba' --> key: [0, 3])
  letters = string.split("")
  longestPalindrome=""
  i=0
  while i < letters.length                                    #traverse each letter in the string and add it to the Hash, along with its index in the string array
    letterIndicesContainer[letters[i]].push i                 #if letter appears several times in the string, this pushes the additional indexes into the keys array
    i += 1
  end

  letterIndicesContainer.each do |hash, key| 
      puts letterIndicesContainer
      puts "hash: #{hash}"
      puts "key: #{key}"

    i = 0
    j = key.length-1    #the last index, (e.g. key: [0, 1, 3] would be index = 2) of the array containing indices of a particular letter's loc in the string

    if key.length > 1       # more than one index stored for a particular letter (the letter appears in the string multiple times)
      while i < string.length 
        while j > i         #starting from the outermost key index in the hopes of capturing the longest palindrome-substring 
                            # (e.g. key: [0,1,3] starts with the substring from indexes 0:3 first, then 0:1, then 1:3)
          chunk = string.slice(key[i], key[j] - key[i] + 1) #slice(start, length) :: +1 to include the end string digit
          puts "#{key[i]}, #{key[j]}"
          puts "chunk: #{chunk}"    #substring
          isPalindrome = palindrome?(chunk)
          puts "isPalindrome: #{isPalindrome}"
          puts "longestPalindrome: #{longestPalindrome}"    #current longest palindrome
          if (isPalindrome) && chunk.length > longestPalindrome.length
            longestPalindrome = chunk
            puts "new longestPalindrome: #{longestPalindrome}"
          end
          puts "-" * 15
          j = j - 1 
        end
        i += 1
      end
    end
  end
  return longestPalindrome
end
=end