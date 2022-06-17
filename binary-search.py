def binary_search(number_list, target_number):
    """
    Returns Index of the target number if found
    Returns None if target number not found
    """
    iteration_count = 0
    start = 0
    end = len(number_list) - 1
    while start <= end:
        iteration_count += 1
        mid = (start+end)//2
        if number_list[mid] == target_number:
            return mid, iteration_count
        elif number_list[mid] < target_number:
            start = mid + 1
        else:
            end = mid - 1

    return None, iteration_count


def verify(index):
    if index is None:
        print("Target Not found")
    else:
        print(f"Target is at index: {index}")


number_list = [k for k in range(1, 100000000)]
result, iteration_count = binary_search(number_list, 49999999)
verify(result)
print(f"Took {iteration_count} iterations")
