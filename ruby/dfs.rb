
class Vertex
  attr_accessor :color, :previousNode, :adjacent, :discoveredTimestamp, :finishedTimestamp
   
  def initialize(color = 'white', previousNode = nil, adjacent = [], discoveredTimestamp=nil, finishedTimestamp=nil) # unvisited nodes are white; discovered: gray; finished: black
    @color, @previousNode, @adjacent, @discoveredTimestamp, @finishedTimestamp = color, previousNode, adjacent, discoveredTimestamp, finishedTimestamp
  end

  def to_s
    "color: #{color}, previous: #{previousNode}, adjacent: #{adjacent}, discovered: #{discoveredTimestamp}, finished: #{finishedTimestamp}"
  end
end


$time = 0
def readInGraph()
  vertices = Hash.new
  graphEdges = [
    "AB",
    "AC",
    "BD",
    "BE",
    "BF",
    "CG",
    "GH"
  ]

  graphEdges.each do |edge|
    unless vertices[edge[0]]
      vertices[edge[0]] = Vertex.new()      # the value of each vertex (key) in the hash is a vector which holds the attributes of that vertex (color, timestamps, etc)
    end
  
    vertices[edge[0]].adjacent.push edge[1] 
    vertices[edge[1]] = Vertex.new        # adj vertices are added to the vertices hash here incase they don't have any adjacent graphEdges of their own
  end
  return vertices
end


def dfs(soughtNode) 
  vertices = readInGraph()

  vertices.each do |vertex, data|
    if vertices[vertex].color == 'white'
      dfs_visit(vertices, vertex, soughtNode) 
    end
  end
  vertices.each {|vertex, data| puts "#{vertex}: #{data}"}      # prints out all the vertex info
end


def dfs_visit(vertices, vertex, soughtNode)
  $time += 1 
  vertices[vertex].discoveredTimestamp = $time
  vertices[vertex].color = 'gray'                 # node has been discovered
  
  puts "soughtNode: #{soughtNode}"
  puts "vertex: #{vertex}"
  puts "color: #{vertices['D'].color}"
  if vertices['D'].color.to_s.eql? "gray"         ###  BUG  ### can't substitute letter with soughtNode variable
    puts soughtNode                               
    exit true
  end
  
  vertices[vertex].adjacent.each do |adjNode|
    if vertices[adjNode].color == 'white'
      vertices[adjNode].previousNode = vertex
      dfs_visit(vertices, adjNode, soughtNode)
    end
  end
  
  vertices[vertex].color = 'black'              # node has no unvisited adjacent nodes
  $time += 1
  vertices[vertex].finishedTimestamp = $time
end


  def main()                  # prompts user for search algorithm and respective node
    puts "SELECT: "
    puts "\t 1 dfs"
    puts "\t 2 bfs"
    algorithm = gets.to_i

    puts "Enter the sought node (for dfs) or source node (for bfs)"
    node = gets.upcase.to_s

    dfs(node) if algorithm == 1
    puts "Sorry, this functionality isn't built yet" if algorithm == 2
  end

  main