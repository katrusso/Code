def first_square_numbers(number_of_squares)
	squares = []

	i = 0
	while i < number_of_squares
		squares.push(i*i)
		i = i + 1
	end
	return squares
end


puts("How many square numbers do you want?")
number_of_desired_squares = gets.to_i
squares = first_square_numbers(number_of_desired_squares) 

i = 0
while i<squares.length
	puts(squares[i])
	i = i + 1
end

