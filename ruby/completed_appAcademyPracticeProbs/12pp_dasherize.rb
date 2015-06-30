# Write a method that takes in a number and returns a string, placing
# a single dash before and after each odd digit. There is one
# exception: don't start or end the string with a dash.
#
# You may wish to use the `%` modulo operation; you can see if a number
# is even if it has zero remainder when divided by two.
#
# Difficulty: medium.


def is_odd(num)
	if num % 2 == 0
		return false
	else
		return true
	end
end


def dasherize_number(num)
	splitNum = num.to_s.split("")
	output = ""
	
	i = 0
	while i < splitNum.length
		currentIsOdd = is_odd(splitNum[i].to_i)		
		lastOutputChar = output[output.length-1]

		puts %/
		----------------------------------
		current number: #{splitNum[i]}
		currentIsOdd: #{currentIsOdd}
		output: #{output}
		lastOutputChar: #{lastOutputChar}/



		if currentIsOdd && i == splitNum.length-1 && lastOutputChar == "-"		#last number is odd and prev num was odd
			output = output + splitNum[i].to_s

		elsif currentIsOdd && i == splitNum.length-1 && lastOutputChar != "-"	#last number is odd and prev num was even
			output = output + "-" + splitNum[i].to_s

		elsif currentIsOdd && i == 0 || currentIsOdd && lastOutputChar == "-"	#first number is odd, or current is odd and prev was odd
			output = output + splitNum[i].to_s + "-"
		 
		elsif currentIsOdd	&& lastOutputChar != "-"							#current is odd, prev was even
			output = output + "-" + splitNum[i].to_s + "-"

		else
			output = output + splitNum[i].to_s									#current is even 
		end
		
		i += 1
	end
	puts "\t\toutput: #{output}"
	return output
end


# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts(
  'dasherize_number(203) == "20-3": ' +
  (dasherize_number(203) == '20-3').to_s
)
puts(
  'dasherize_number(303) == "3-0-3": ' +
  (dasherize_number(303) == '3-0-3').to_s
)
puts(
  'dasherize_number(333) == "3-3-3": ' +
  (dasherize_number(333) == '3-3-3').to_s
)
puts(
  'dasherize_number(3223) == "3-22-3": ' +
  (dasherize_number(3223) == '3-22-3').to_s
)

=begin 
#APP ACADEMY SOLN

def dasherize_number(num)
  num_s = num.to_s

  result = ""

  idx = 0
  while idx < num_s.length
    digit = num_s[idx].to_i

    if (idx > 0)
      prev_digit = num_s[idx - 1].to_i
      if (prev_digit % 2 == 1) || (digit % 2 == 1)
        result += "-"
      end
    end
    result += num_s[idx]

    idx += 1
  end

  return result
end
=end

