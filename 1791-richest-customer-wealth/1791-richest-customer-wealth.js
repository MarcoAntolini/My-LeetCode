/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function (accounts) {
	return accounts.map(account => account.reduce((a, b) => a + b)).sort((a, b) => b - a)[0]
}
