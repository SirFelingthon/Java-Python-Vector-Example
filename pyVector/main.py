import math


class Vector2:
    def __init__(self, x, y):
        self.x, self.y = x, y
    
    def magnitude(self):
        return math.sqrt(self.x * self.x + self.y * self.y)
    
    def normalize(self):
        magnitude = self.magnitude()
        if magnitude != 0:
            self.x, self.y = self.x / magnitude, self.y / magnitude
        
    def directionTo(self, toPos):
        return math.degrees(math.atan2(toPos.y - self.y, toPos.x - self.x))


playerPos = Vector2(1, 1)

print(playerPos.magnitude())
playerPos.normalize()
print(playerPos.magnitude())

enemyPos = Vector2(2, 2)

print(playerPos.directionTo(enemyPos))
