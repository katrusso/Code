'''
Write a method that takes an array of numbers.
The method should multiply each number in the array by its position 
in the array, and return the sum. 

'''

def crazy_sum(numbers)
	sum = 0
	i = 0

	while i < numbers.length
		sum = sum + (numbers[i] * i)
		i+=1
	end
	return sum.to_s
end


puts(
	crazy_sum([2]) == 0.to_s # (2*0)
	)

puts(
crazy_sum([2, 3]) == 3.to_s # (2*0) + (3*1)
)

puts(
crazy_sum([2, 3, 5]) == 13.to_s # (2*0) + (3*1) + (5*2)
)

puts(
crazy_sum([2, 3, 5, 2]) == 19.to_s # (2*0) + (3*1) + (5*2) + (2*3)
)