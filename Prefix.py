# Example list of common prefixes and suffixes
prefixes = ['un', 're', 'in', 'dis', 'im', 'pre', 'mis', 'non']
suffixes = ['ing', 'ed', 'es', 'er', 'ly', 'ness', 'ment', 'ful', 'ive']

def custom_stem(word):
    # Remove common prefixes if present
    for prefix in prefixes:
        if word.startswith(prefix):
            word = word[len(prefix):]
            break  # Remove only one prefix

    # Remove common suffixes if present
    for suffix in suffixes:
        if word.endswith(suffix):
            word = word[:-len(suffix)]
            break  # Remove only one suffix

    return word

# Test the custom stemmer
words = ['unhappiness', 'recovery', 'misunderstood', 'running', 'happiness', 'prevalent']
stemmed_words = [custom_stem(word) for word in words]

print(stemmed_words)
