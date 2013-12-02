package com.boos.euler

def sum = 0
def arr = 1..999
arr.findAll { it % 3 == 0 || it % 5 == 0 }.each { sum += it }
println sum