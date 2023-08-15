/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function (allowed, words) {
	let count = 0
	for (const word of words) {
		let isConsistent = true
		for (const letter of word) {
			if (!allowed.includes(letter)) {
				isConsistent = false
				break
			}
		}
		if (isConsistent) count++
	}
	return count
}
