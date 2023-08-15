/**
 * @param {number} num
 * @return {number}
 */
var numberOfSteps = function (num) {
	if (num == 0)
		return num;
	return 1 + (num % 2 == 0 ? numberOfSteps(num / 2) : numberOfSteps(num - 1));
}
