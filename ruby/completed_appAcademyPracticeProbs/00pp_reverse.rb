# Write a method that will take a string as input, and return a new
# string with the same letters in reverse order.
#
# Don't use String's reverse method; that would be too simple.
#
# Difficulty: easy.

def reverse(string)
  string = string.split("")
  output = ""
  
  return output = string.pop + reverse(string.join) unless string.empty?
  return output 
end


# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts( 'reverse("abc") == "cba": ' + (reverse("abc") == "cba").to_s )
puts( 'reverse("a") == "a": ' + (reverse("a") == "a").to_s )
puts( 'reverse("") == "": ' + (reverse("") == "").to_s )


=begin
#APP ACADEMY SOLN
def reverse(string)
  reversed_string = ""

  i = 0
  while i < string.length
    reversed_string = string[i] + reversed_string

    i += 1
  end

  return reversed_string
end
=end



=begin 
# MY ORIGINAL SOLN

def reverse(string)
	i = string.length - 1
	new_string = ""
	
	while i >= 0 do
		new_string = new_string + string[i]
		i-=1
	end
	return new_string
end
=end
