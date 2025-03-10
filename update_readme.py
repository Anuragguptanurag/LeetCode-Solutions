import os

# Path to your LeetCode-Solutions repository
repo_path = "C:/Users/Gupta Ji/Documents/GitHub/LeetCode-Solutions"

# Readme File Path
readme_path = os.path.join(repo_path, "README.md")

# Function to generate a markdown link

def generate_link(file_path):
    file_name = os.path.basename(file_path)
    problem_name = file_name.replace(".java", "")
    problem_link = f"https://github.com/your-username/LeetCode-Solutions/blob/main/{file_path.replace(repo_path + '/', '')}"
    return f"- [{problem_name}]({problem_link})"

# Function to scan the repository and update README.md

def update_readme():
    content = "# LeetCode Solutions\n\n## Easy\n"

    for root, dirs, files in os.walk(repo_path):
        if 'Easy' in root:
            for file in files:
                if file.endswith(".java"):
                    file_path = os.path.join(root, file)
                    content += generate_link(file_path) + "\n"

    content += "\n## Medium\n"
    for root, dirs, files in os.walk(repo_path):
        if 'medium' in root:
            for file in files:
                if file.endswith(".java"):
                    file_path = os.path.join(root, file)
                    content += generate_link(file_path) + "\n"

    content += "\n## Hard\n"
    for root, dirs, files in os.walk(repo_path):
        if 'hard' in root:
            for file in files:
                if file.endswith(".java"):
                    file_path = os.path.join(root, file)
                    content += generate_link(file_path) + "\n"

    with open(readme_path, "w") as f:
        f.write(content)

if __name__ == "__main__":
    update_readme()
    print("README.md Updated Successfully!")
