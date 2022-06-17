def linear_search(number_list, target_number):
    """
    Returns Index of the target number if found
    Returns None if target number not found
    """
    iteration_count = 0
    for i in range(0, len(number_list)):
        iteration_count += 1
        if number_list[i] == target_number:
            return i, iteration_count
    # when not found
    return None, iteration_count


def verify(index):
    if index is None:
        print("Target Not found")
    else:
        print(f"Target is at index: {index}")


number_list = [k for k in range(1, 100000000)]
result, iteration_count = linear_search(number_list, 49999999)
verify(result)
print(f"Took {iteration_count} iterations")
