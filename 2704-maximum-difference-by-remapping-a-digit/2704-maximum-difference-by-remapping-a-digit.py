class Solution:
    def minMaxDifference(self, num: int) -> int:
        max = str(num)
        for ch in max:
            if ch != '9':
                max = max.replace(ch,'9')
                break
        min = str(num)
        min = min.replace(min[0],'0')
        return int(max) - int(min)
        