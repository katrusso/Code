me = {'name' => 'Kat', 'age' => 32, 'height' => 5 * 12 + 6 }
puts me
puts me['name']
me['city'] = "Albany"
puts me

me[999] = 'Wow'
me[998] = 'Neato'
puts me[999]
puts me


# DELETING HASH/DICTIONARY ENTRIES
me.delete(998)

me.delete('city')

puts me
