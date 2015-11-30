# Write a method that takes in two numbers. Return the greatest
# integer that evenly divides both numbers. You may wish to use the
# `%` modulo operation.
#
# Difficulty: medium.

def get_min_and_max(number1, number2)				 
  min_max = [number1.abs, number2.abs].minmax				# i took the abs value since the gcf of neg num(s) will be positive, and the while condition (in gcf fn, below)  
  return min_max[0], min_max[1]							# requires pos numbers; should i rename any of the variables to reflect this?
end

def greatest_common_factor(number1, number2)
  smallerNum, largerNum = get_min_and_max(number1,number2)
	
  return number1 if number1 == number2
  return if smallerNum == 0
  return smallerNum if largerNum % smallerNum == 0
	
  i = smallerNum-1
  while i > 0
    return i if smallerNum % i == 0 && largerNum % i == 0	
	i -=1
  end
end
	
# These are tests to check that your code is working. After writing
# your solution, they should all print true.


puts(
  'greatest_common_factor(3, 9) == 3: ' +
  (greatest_common_factor(3, 9) == 3).to_s
)
puts(
  'greatest_common_factor(16, 24) == 8: ' +
  (greatest_common_factor(16, 24) == 8).to_s
)
puts(
  'greatest_common_factor(3, 5) == 1: ' +
  (greatest_common_factor(3, 5) == 1).to_s
)
puts(
  'greatest_common_factor(6, -8) == 2: ' +
  (greatest_common_factor(6, -8) == 2).to_s
)
puts(
  'greatest_common_factor(0, -5) == nil: ' +
  (greatest_common_factor(0, -5) == nil).to_s
)


=begin
#APP ACADEMY SOLN
---------------------------------
def greatest_common_factor(number1, number2)
  # start i at smaller of number1, number2
  i = nil
  if number1 <= number2
    i = number1
  else
    i = number2
  end

  while true
    if (number1 % i == 0) && (number2 % i == 0)
      return i
    end

    i -= 1
  end
end
---------------------------------
=end





=begin 
# MY INITIAL SOLNS:: 
---------------------------------
def greatest_common_factor(number1, number2)			#ALTERNATE VERSION 2
	return number1 if number1 == number2

	i=smallerNum = [number1.abs, number2.abs].min  		# evaluates min and max within fn; should this broken into a separate fn because it's a separate task
	largerNum = [number1.abs, number2.abs].max 			# (determining which number is bigger) or kept within the fn so all the related functionality is together?
	
	return if smallerNum == 0
	return smallerNum if largerNum % smallerNum == 0
	
	while i > 0											# would this be better as "while true" since the loop will always return by "i=1" if all else fails 
		i -=1
		return i if smallerNum % i == 0 && largerNum % i == 0	
	end
end

#----------------------------------------------------------------------------------------------------------------

def greatest_common_factor(number1, number2)			#ALTERNATE VERSION 1
	return number1 if number1 == number2

	if number1 < number2								# is this faster than using [].min and [].max?
		smallerNum = number1 							# how do built-in fns affect the speed code runs in comparison to conditionals that evaluate to the same end?
		largerNum = number2
	else 
		smallerNum = number2
		largerNum = number1
	end
	
	return if smallerNum == 0
	return smallerNum if largerNum % smallerNum == 0
	
	i = smallerNum-1
	while i > 0
		return i if smallerNum % i == 0 && largerNum % i == 0
		i -=1
	end
end
---------------------------------
=end