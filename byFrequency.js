  
/**
 * @param {string} s
 * @return {string}
 */

var frequencySort = function(s) {
    const occur = {};
    s.split('').forEach(sc => occur[sc] = occur[sc] + 1 || 1);
    let final =  Object.keys(occur).sort((a, b) => occur[b] - occur[a]).reduce((str, char) => str += char.repeat(occur[char]), '');
    return final
};
